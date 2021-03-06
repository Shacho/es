/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.common.plugin.service;

import com.sishuok.es.common.inject.annotation.BaseComponent;
import com.sishuok.es.common.plugin.entity.Tree;
import com.sishuok.es.common.plugin.repository.TreeRepository;
import com.sishuok.es.common.plugin.serivce.BaseTreeableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 13-2-4 下午3:01
 * <p>Version: 1.0
 */
@Service
public class TreeService extends BaseTreeableService<Tree, Long> {

    @Autowired
    @BaseComponent
    private TreeRepository treeRepository;


}
