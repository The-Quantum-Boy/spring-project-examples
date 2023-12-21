package com.sumit.pagesort.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.beans.support.PropertyComparator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.pagesort.dto.PageRequestDto;
import com.sumit.pagesort.entity.Student;
import com.sumit.pagesort.repository.StudentRepo;

@RestController
@RequestMapping("/student")
public class StudentController {

	
	@Autowired 
	private StudentRepo studentRepo;
	
	@PostMapping
	public Page<Student> getAllStudentUsingPaginition(@RequestBody PageRequestDto dto){
		Pageable pageble= new PageRequestDto().getPageable(dto);
		
		Page<Student> studentPage = studentRepo.findAll(pageble);
		return studentPage;
		
	}
	
	//paginition on list
	@PostMapping("/list")
	public Page<Student> getAllStdentsUsingPaginationList(@RequestBody PageRequestDto dto){
		
		List<Student> studentsList=studentRepo.findAll();
		
		//1 pageListHolder
		
		PagedListHolder<Student> pageListHolder =new PagedListHolder<Student>(studentsList);
		
		pageListHolder.setPage(dto.getPageNo());
		pageListHolder.setPageSize(dto.getPageSize());
		
		
		
		//2 Properycomparator
		List<Student> pageSlice=pageListHolder.getPageList();
		
		boolean ascending = dto.getSort().isAscending();
		PropertyComparator.sort(pageSlice, new MutableSortDefinition(dto.getSortByColumn(),true, ascending));
		
		
		//3 PageImpl
		Page<Student> students= new PageImpl<Student>(pageSlice,new PageRequestDto().getPageable(dto),studentsList.size());
		
		
		return students;
	}
	
	
	
	
	@PostMapping("/queryMethod/{city}")
	public Page<Student> getAllStudentUsingPaginationQueryMethod(@RequestBody PageRequestDto dto,@PathVariable(value="city") String city){
		
		Pageable pagable= new PageRequestDto().getPageable(dto);
		
		Page<Student> studentPage= studentRepo.findAllByCity(city, pagable);
		
		return studentPage;
	}
	
	@PostMapping("/nativeMethod/{city}")
	public Page<Student> getAllStudentUsingPaginationNativeMethod(@RequestBody PageRequestDto dto,@PathVariable(value="city") String city){
		
		Pageable pagable= new PageRequestDto().getPageable(dto);
		
		Page<Student> studentPage= studentRepo.findAllByCity(city, pagable);
		
		return studentPage;
	}
}
