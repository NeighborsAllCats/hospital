package com.phs.hospital.core.dal.manager.impl;

import com.phs.hospital.core.dal.domain.PhsAppointment;
import com.phs.hospital.core.dal.dao.PhsAppointmentDao;
import com.phs.hospital.core.dal.manager.PhsAppointmentManager;
import com.phs.hospital.core.common.base.BaseManagerImpl;
import org.springframework.stereotype.Component;

@Component
public class PhsAppointmentManagerImpl extends BaseManagerImpl<PhsAppointmentDao, PhsAppointment> implements PhsAppointmentManager{

}
