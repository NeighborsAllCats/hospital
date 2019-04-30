package com.phs.hospital.core.dal.manager.impl;

import com.phs.hospital.core.dal.domain.PhsSection;
import com.phs.hospital.core.dal.dao.PhsSectionDao;
import com.phs.hospital.core.dal.manager.PhsSectionManager;
import com.phs.hospital.core.common.base.BaseManagerImpl;
import org.springframework.stereotype.Component;

@Component
public class PhsSectionManagerImpl extends BaseManagerImpl<PhsSectionDao, PhsSection> implements PhsSectionManager{

}
