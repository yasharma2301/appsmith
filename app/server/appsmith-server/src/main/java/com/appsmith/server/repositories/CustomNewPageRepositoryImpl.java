package com.appsmith.server.repositories;

import com.appsmith.server.repositories.ce.CustomNewPageRepositoryCEImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomNewPageRepositoryImpl extends CustomNewPageRepositoryCEImpl implements CustomNewPageRepository {

    public CustomNewPageRepositoryImpl(MongoTemplate mongoTemplate) {
        super(mongoTemplate);
    }
}
