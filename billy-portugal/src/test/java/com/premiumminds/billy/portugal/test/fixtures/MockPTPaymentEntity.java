/**
 * Copyright (C) 2013 Premium Minds.
 *
 * This file is part of billy portugal (PT Pack).
 *
 * billy portugal (PT Pack) is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * billy portugal (PT Pack) is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with billy portugal (PT Pack). If not, see <http://www.gnu.org/licenses/>.
 */
package com.premiumminds.billy.portugal.test.fixtures;

import java.math.BigDecimal;
import java.util.Date;

import com.premiumminds.billy.core.test.fixtures.MockBaseEntity;
import com.premiumminds.billy.portugal.persistence.entities.PTPaymentEntity;


public class MockPTPaymentEntity extends MockBaseEntity implements
		PTPaymentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected String paymentMethod;
	protected BigDecimal paymentAmount;
	protected Date paymentDate;

	@Override
	public String getPaymentMethod() {
		return paymentMethod;
	}

	@Override
	public BigDecimal getPaymentAmount() {
		return paymentAmount;
	}

	@Override
	public Date getPaymentDate() {
		return paymentDate;
	}

	@Override
	public void setPaymentMethod(String method) {
		this.paymentMethod = method;
	}

	@Override
	public void setPaymentAmount(BigDecimal amount) {
		this.paymentAmount = amount;
	}

	@Override
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

}
