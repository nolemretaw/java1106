package com.lanou.service.cluster;

import com.lanou.bean.cluster.ClusterEmp;
import com.lanou.bean.master.Emp;

import java.util.List;

public interface ClusterEmpService {
    public List<ClusterEmp> findAllEmp();
    int addEmp(Emp emp);
}
