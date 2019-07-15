package com.lanou.mapper.cluster;

import com.lanou.annotation.MybatisAnnotation;
import com.lanou.bean.cluster.ClusterEmp;
import com.lanou.bean.master.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("clusterEmpMapper")
public @MybatisAnnotation interface ClusterEmpMapper {
    List<ClusterEmp> findAllEmp();
    int addEmp(Emp emp);
}
