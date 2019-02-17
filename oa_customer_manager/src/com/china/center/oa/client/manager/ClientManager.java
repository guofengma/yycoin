package com.china.center.oa.client.manager;

import com.center.china.osgi.publics.ListenerManager;
import com.center.china.osgi.publics.User;
import com.china.center.common.MYException;
import com.china.center.oa.client.bean.*;
import com.china.center.oa.client.listener.ClientListener;
import com.china.center.oa.client.vo.*;
import com.china.center.oa.client.vs.DestStafferVSCustomerBean;

import java.util.List;


public interface ClientManager extends ListenerManager<ClientListener>
{
	boolean applyAddOrUpdateClient(User user, CustomerIndividualApplyBean bean, String addOrUpdate)
		throws MYException;
	
	boolean applyAddOrUpdateClient(User user, CustomerDepartApplyBean bean, String addOrUpdate)
	throws MYException;
	
	boolean applyAddOrUpdateClient(User user, CustomerCorporationApplyBean bean, String addOrUpdate)
	throws MYException;
	
    boolean delApply(User user, String cid)
    throws MYException;
    
    boolean hasCustomerAuth(String stafferId, String customerId)
    throws MYException;
    
    CustomerIndividualApplyVO findIndividualApplyVO(String id)
    throws MYException;
    
    CustomerDepartApplyVO findDepartApplyVO(String id)
    throws MYException;
    
    CustomerCorporationApplyVO findCorporationApplyVO(String id)
    throws MYException;
    
    CustomerIndividualVO findIndividualVO(String id, String update)
    throws MYException;
    
    CustomerDepartVO findDepartVO(String id, String update)
    throws MYException;
    
    CustomerCorporationVO findCorporationVO(String id, String update)
    throws MYException;
    
    boolean passApplyClient(User user, String cid)
    throws MYException;
    
    boolean rejectApplyClient(User user, String cid, String reson)
    throws MYException;
    
    void addAccessLog(User user, String stafferId, String customerId)
	throws MYException;
    
    boolean applyDelClient(User user, CustomerApproveBean bean)
    throws MYException;
    
    boolean addAssignApply(User user, AssignApplyBean bean)
    throws MYException;
    
    boolean passAssignApply(User user, String cid)
    throws MYException;
    
    boolean rejectAssignApply(User user, String cid)
    throws MYException;
    
    boolean reclaimAssignClient(User user, String cid, String type, String destStafferId)
    throws MYException;

    boolean reclaimStafferAssignClient(User user, String stafferId, String destStafferId, int flag)
    throws MYException;
    
    double sumNoPayBusiness(CustomerBean bean);
    
    boolean addAddressBean(User user, AddressBean bean)
	throws MYException;

	boolean updateAddressBean(User user, AddressBean bean)
		throws MYException;
	
	boolean delAddressBean(User user, String id)
		throws MYException;
	
	boolean addCiticBean(User user, CiticBranchBean bean)
		throws MYException;
	
	boolean updateCiticBean(User user, CiticBranchBean bean)
	throws MYException;
	
	boolean delCiticBean(User user, String id)
	throws MYException;
	
	void synchronizationAllCustomerLocation();
	
    boolean hasCustomerAuth2(String stafferId, String customerId);
    
    boolean batchTransCustomer(User user, int type) throws MYException;

    boolean batchTransferCustomer(User user, List<DestStafferVSCustomerBean> beans) throws MYException;

    void importCustomer(List<CustomerVO> customerVOList) throws MYException;

    void importCustomerAddress(List<CustomerVO> customerList) throws MYException;
}
