/*******************************************************************************
 * This file is protected by Copyright. 
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package mil.jpeojtrs.sca.util.math;

import org.omg.CORBA.Any;

/**
 * @since 3.4
 */
public abstract class ComplexNumber {

	public abstract Any toAny();

	public abstract Object getValue(int index);

	public abstract int getSize();

	/**
	 * Converts a string to the appropriate {@link ComplexNumber} type.
	 * @param type The CORBA type name
	 * @param value The value expressed as a string
	 * @return A {@link ComplexNumber} representing the string
	 */
	public static ComplexNumber valueOf(String type, String value) {
		if (value == null) {
			return null;
		}
		if ("double".equalsIgnoreCase(type)) {
			return ComplexDouble.valueOf(value);
		} else if ("float".equalsIgnoreCase(type)) {
			return ComplexFloat.valueOf(value);
		} else if ("short".equalsIgnoreCase(type)) {
			return ComplexShort.valueOf(value);
		} else if ("long".equalsIgnoreCase(type)) {
			return ComplexLong.valueOf(value);
		} else if ("longlong".equalsIgnoreCase(type)) {
			return ComplexLongLong.valueOf(value);
		} else if ("ulong".equalsIgnoreCase(type)) {
			return ComplexULong.valueOf(value);
		} else if ("ushort".equalsIgnoreCase(type)) {
			return ComplexUShort.valueOf(value);
		} else if ("ulonglong".equalsIgnoreCase(type)) {
			return ComplexULongLong.valueOf(value);
		} else if ("octet".equalsIgnoreCase(type)) {
			return ComplexByte.valueOf(value);
		} else {
			throw new IllegalArgumentException("Unknown CORBA Type: " + type);
		}
	}

	@Override
	public String toString() {
		if (getSize() == 2) {
			Object complexValue = getValue(1);
			if (complexValue == null) {
				return String.valueOf(getValue(0));
			} else {
				String complexStr = String.valueOf(complexValue);
				char modifier = '+';
				if (complexValue instanceof Number) {
					Number complexNumber = (Number) complexValue;
					if (1.0 == complexNumber.doubleValue()) {
						complexStr = "";
					} else if (-1.0 == complexNumber.doubleValue()) {
						complexStr = "";
						modifier = '-';
					}
				}

				if (complexStr.length() > 0 && complexStr.charAt(0) == '-') {
					complexStr = complexStr.substring(1, complexStr.length());
					modifier = '-';
				}
				return getValue(0).toString() + modifier + "j" + complexStr;
			}
		}
		StringBuilder builder = new StringBuilder();
		builder.append("(");
		for (int i = 0; i < getSize(); i++) {
			builder.append(getValue(i));
			if (i + 1 < getSize()) {
				builder.append(", ");
			}
		}
		builder.append(")");
		return builder.toString();
	}
}
