package com.example.pb_store.repository.mybatis;

import com.example.pb_store.domain.Individual;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndividualMapper {
    void bulkInsert(List<Individual> individualList);
}
