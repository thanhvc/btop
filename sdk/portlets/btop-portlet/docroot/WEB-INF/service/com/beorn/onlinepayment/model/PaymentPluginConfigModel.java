/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.beorn.onlinepayment.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the PaymentPluginConfig service. Represents a row in the &quot;Payment_PaymentPluginConfig&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.beorn.onlinepayment.model.impl.PaymentPluginConfigModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.beorn.onlinepayment.model.impl.PaymentPluginConfigImpl}.
 * </p>
 *
 * @author Sebastien Meunier
 * @see PaymentPluginConfig
 * @see com.beorn.onlinepayment.model.impl.PaymentPluginConfigImpl
 * @see com.beorn.onlinepayment.model.impl.PaymentPluginConfigModelImpl
 * @generated
 */
public interface PaymentPluginConfigModel extends BaseModel<PaymentPluginConfig> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a payment plugin config model instance should use the {@link PaymentPluginConfig} interface instead.
	 */

	/**
	 * Returns the primary key of this payment plugin config.
	 *
	 * @return the primary key of this payment plugin config
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this payment plugin config.
	 *
	 * @param primaryKey the primary key of this payment plugin config
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this payment plugin config.
	 *
	 * @return the uuid of this payment plugin config
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this payment plugin config.
	 *
	 * @param uuid the uuid of this payment plugin config
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the company ID of this payment plugin config.
	 *
	 * @return the company ID of this payment plugin config
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this payment plugin config.
	 *
	 * @param companyId the company ID of this payment plugin config
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this payment plugin config.
	 *
	 * @return the group ID of this payment plugin config
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this payment plugin config.
	 *
	 * @param groupId the group ID of this payment plugin config
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this payment plugin config.
	 *
	 * @return the user ID of this payment plugin config
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this payment plugin config.
	 *
	 * @param userId the user ID of this payment plugin config
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this payment plugin config.
	 *
	 * @return the user uuid of this payment plugin config
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this payment plugin config.
	 *
	 * @param userUuid the user uuid of this payment plugin config
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the payment plugin config ID of this payment plugin config.
	 *
	 * @return the payment plugin config ID of this payment plugin config
	 */
	public long getPaymentPluginConfigId();

	/**
	 * Sets the payment plugin config ID of this payment plugin config.
	 *
	 * @param paymentPluginConfigId the payment plugin config ID of this payment plugin config
	 */
	public void setPaymentPluginConfigId(long paymentPluginConfigId);

	/**
	 * Returns the create date of this payment plugin config.
	 *
	 * @return the create date of this payment plugin config
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this payment plugin config.
	 *
	 * @param createDate the create date of this payment plugin config
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this payment plugin config.
	 *
	 * @return the modified date of this payment plugin config
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this payment plugin config.
	 *
	 * @param modifiedDate the modified date of this payment plugin config
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the seller ID of this payment plugin config.
	 *
	 * @return the seller ID of this payment plugin config
	 */
	public long getSellerId();

	/**
	 * Sets the seller ID of this payment plugin config.
	 *
	 * @param sellerId the seller ID of this payment plugin config
	 */
	public void setSellerId(long sellerId);

	/**
	 * Returns the payment plugin ID of this payment plugin config.
	 *
	 * @return the payment plugin ID of this payment plugin config
	 */
	public long getPaymentPluginId();

	/**
	 * Sets the payment plugin ID of this payment plugin config.
	 *
	 * @param paymentPluginId the payment plugin ID of this payment plugin config
	 */
	public void setPaymentPluginId(long paymentPluginId);

	/**
	 * Returns the config of this payment plugin config.
	 *
	 * @return the config of this payment plugin config
	 */
	@AutoEscape
	public String getConfig();

	/**
	 * Sets the config of this payment plugin config.
	 *
	 * @param config the config of this payment plugin config
	 */
	public void setConfig(String config);

	/**
	 * Returns the configured of this payment plugin config.
	 *
	 * @return the configured of this payment plugin config
	 */
	public boolean getConfigured();

	/**
	 * Returns <code>true</code> if this payment plugin config is configured.
	 *
	 * @return <code>true</code> if this payment plugin config is configured; <code>false</code> otherwise
	 */
	public boolean isConfigured();

	/**
	 * Sets whether this payment plugin config is configured.
	 *
	 * @param configured the configured of this payment plugin config
	 */
	public void setConfigured(boolean configured);

	/**
	 * Returns the default plugin of this payment plugin config.
	 *
	 * @return the default plugin of this payment plugin config
	 */
	public boolean getDefaultPlugin();

	/**
	 * Returns <code>true</code> if this payment plugin config is default plugin.
	 *
	 * @return <code>true</code> if this payment plugin config is default plugin; <code>false</code> otherwise
	 */
	public boolean isDefaultPlugin();

	/**
	 * Sets whether this payment plugin config is default plugin.
	 *
	 * @param defaultPlugin the default plugin of this payment plugin config
	 */
	public void setDefaultPlugin(boolean defaultPlugin);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(PaymentPluginConfig paymentPluginConfig);

	public int hashCode();

	public CacheModel<PaymentPluginConfig> toCacheModel();

	public PaymentPluginConfig toEscapedModel();

	public String toString();

	public String toXmlString();
}