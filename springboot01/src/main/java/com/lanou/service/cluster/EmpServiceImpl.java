package com.lanou.service.cluster;

import com.lanou.bean.cluster.ClusterEmp;
import com.lanou.bean.master.Emp;
import com.lanou.mapper.cluster.ClusterEmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springboot01
 * @description:
 * @author: hutingrong
 * @create: 2019-07-14 17:02
 */
@Service("clusterEmpService")
public class EmpServiceImpl implements ClusterEmpService {
    @Autowired
    private ClusterEmpMapper clusterEmpMapper;
    @Override
    public List<ClusterEmp> findAllEmp() {
        return clusterEmpMapper.findAllEmp();
    }

    @Override
    public int addEmp(Emp emp) {
        return clusterEmpMapper.addEmp(emp);
    }
}
