package com.rest.model;

import java.io.Serializable;
import java.util.Arrays;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class Unit implements Serializable {

	private static final long serialVersionUID = 964463654264353888L;

	public enum WeightUnit {
		GRAM("gram"), POUND("pound");

		WeightUnit(String value) {
			this.value = value;
		}

		private String value;

		public String getValue() {
			return this.value;
		}

		public static boolean contains(String val) {

			return Arrays.asList(WeightUnit.values()).stream().anyMatch(unit -> unit.value.equals(val));
		}
	}

	public enum LengthUnit {
		CM("cm"), INCH("inch");

		LengthUnit(String value) {
			this.value = value;
		}

		private String value;

		public String getValue() {
			return this.value;
		}

		public static boolean contains(String val) {

			return Arrays.asList(LengthUnit.values()).stream().anyMatch(unit -> unit.value.equals(val));
		}
	}

	@NotNull
	private Double value;

	@NotEmpty
	private String measurementUnit;

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getMeasurementUnit() {
		return measurementUnit;
	}

	public void setMeasurementUnit(String measurementUnit) {
		this.measurementUnit = measurementUnit;
	}

	@Override
	public String toString() {
		return "Unit [value=" + value + ", measurementUnit=" + measurementUnit + "]";
	}

}
