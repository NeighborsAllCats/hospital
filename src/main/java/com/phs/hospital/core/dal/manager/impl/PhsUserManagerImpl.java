package com.phs.hospital.core.dal.manager.impl;

import com.phs.hospital.core.dal.domain.PhsUser;
import com.phs.hospital.core.dal.dao.PhsUserDao;
import com.phs.hospital.core.dal.manager.PhsUserManager;
import com.phs.hospital.core.common.base.BaseManagerImpl;
import org.springframework.stereotype.Component;

@Component
public class PhsUserManagerImpl extends BaseManagerImpl<PhsUserDao, PhsUser> implements PhsUserManager{

}
