package com.example.Service;

import com.example.Domain.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {
    List<Role>  findAll();
}
