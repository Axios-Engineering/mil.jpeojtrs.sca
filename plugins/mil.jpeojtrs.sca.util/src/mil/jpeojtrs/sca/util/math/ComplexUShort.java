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

import java.util.Arrays;

import mil.jpeojtrs.sca.util.UnsignedUtils;

import org.omg.CORBA.Any;
import org.omg.CORBA.AnySeqHelper;
import org.omg.CORBA.ORB;

import CF.complexUShort;
import CF.complexUShortHelper;

/**
 * @since 3.4
 */
public class ComplexUShort extends ComplexNumber {
	private final int[] numbers;

	public ComplexUShort() {
		this(0, 0);
	}

	public ComplexUShort(int real, int imag) {
		this(new int[] { real, imag });
	}

	protected ComplexUShort(int... numbers) {
		this.numbers = numbers;
	}

	@Override
	public Any toAny() {
		ORB orb = ORB.init();
		if (numbers.length == 2) {
			complexUShort value = new complexUShort((short) numbers[0], (short) numbers[1]);
			Any any = orb.create_any();
			complexUShortHelper.insert(any, value);
			return any;
		} else {
			Any retVal = orb.create_any();
			Any[] value = new Any[numbers.length];
			for (int i = 0; i < numbers.length; i++) {
				value[i] = orb.create_any();
				value[i].insert_ushort((short) numbers[i]);
			}
			AnySeqHelper.insert(retVal, value);
			return retVal;
		}
	}

	public int getUShortValue(int index) throws ArrayIndexOutOfBoundsException {
		return numbers[index];
	}

	@Override
	public Integer getValue(int index) throws ArrayIndexOutOfBoundsException {
		return numbers[index];
	}

	@Override
	public int getSize() {
		return numbers.length;
	}

	public static ComplexUShort valueOf(Any any) {
		complexUShort complex = complexUShortHelper.extract(any);
		return new ComplexUShort(UnsignedUtils.toSigned(complex.real), UnsignedUtils.toSigned(complex.imag));
	}

	public static ComplexUShort valueOf(String value) {
		String[] strNum = ComplexParser.parse(value);
		int[] numbers = new int[strNum.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.valueOf(strNum[i]);
		}
		return new ComplexUShort(numbers);
	}

	@Override
	public int hashCode() {
		return Arrays.hashCode(numbers);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ComplexUShort) {
			return Arrays.equals(numbers, ((ComplexUShort) obj).numbers);
		}
		return super.equals(obj);
	}
}
