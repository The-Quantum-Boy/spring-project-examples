package com.sumit.pagesort.dto;

import java.util.Objects;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageRequestDto {

	private Integer pageNo=0;
	private Integer pageSize=10;
	
	private Sort.Direction sort=Sort.Direction.ASC;
	
	
	private String sortByColumn="id";
	
	public Pageable getPageable(PageRequestDto dto) {
		Integer page = Objects.nonNull(dto.getPageNo())?dto.pageNo:this.pageNo;
		Integer size = Objects.nonNull(dto.getPageSize())?dto.pageSize:this.pageSize;
		
		Sort.Direction sort = Objects.nonNull(dto.getSort())?dto.sort:this.sort;

		String sortByColumn = Objects.nonNull(dto.getSortByColumn())?dto.sortByColumn:this.sortByColumn;
		
		
		//return PageRequest.of(page, size);

		return PageRequest.of(page, size, sort, sortByColumn);
	}
	
}
