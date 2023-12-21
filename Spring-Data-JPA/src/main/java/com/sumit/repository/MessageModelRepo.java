package com.sumit.repository;

import com.sumit.entities.KeyModel;
import com.sumit.entities.MessageModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageModelRepo extends JpaRepository<MessageModel,KeyModel> {
}
