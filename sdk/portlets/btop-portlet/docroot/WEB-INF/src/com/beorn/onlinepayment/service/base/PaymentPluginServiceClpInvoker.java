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

package com.beorn.onlinepayment.service.base;

import com.beorn.onlinepayment.service.PaymentPluginServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class PaymentPluginServiceClpInvoker {
	public PaymentPluginServiceClpInvoker() {
		_methodName72 = "getBeanIdentifier";

		_methodParameterTypes72 = new String[] {  };

		_methodName73 = "setBeanIdentifier";

		_methodParameterTypes73 = new String[] { "java.lang.String" };

		_methodName78 = "search";

		_methodParameterTypes78 = new String[] {
				"long", "java.lang.String", "java.lang.Boolean",
				"java.lang.Long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName79 = "searchCount";

		_methodParameterTypes79 = new String[] {
				"long", "java.lang.String", "java.lang.Boolean",
				"java.lang.Long"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName72.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes72, parameterTypes)) {
			return PaymentPluginServiceUtil.getBeanIdentifier();
		}

		if (_methodName73.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes73, parameterTypes)) {
			PaymentPluginServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName78.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes78, parameterTypes)) {
			return PaymentPluginServiceUtil.search(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				(java.lang.Boolean)arguments[2], (java.lang.Long)arguments[3],
				((Integer)arguments[4]).intValue(),
				((Integer)arguments[5]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[6]);
		}

		if (_methodName79.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes79, parameterTypes)) {
			return PaymentPluginServiceUtil.searchCount(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				(java.lang.Boolean)arguments[2], (java.lang.Long)arguments[3]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName72;
	private String[] _methodParameterTypes72;
	private String _methodName73;
	private String[] _methodParameterTypes73;
	private String _methodName78;
	private String[] _methodParameterTypes78;
	private String _methodName79;
	private String[] _methodParameterTypes79;
}