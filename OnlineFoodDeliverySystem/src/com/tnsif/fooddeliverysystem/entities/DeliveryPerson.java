package com.tnsif.fooddeliverysystem.entities;

public class DeliveryPerson {
		private int deliveryPesonId;
		private String name;
		private long contactNo;
		public DeliveryPerson(int deliveryPesonId, String name, long contactNo) {
			super();
			this.deliveryPesonId = deliveryPesonId;
			this.name = name;
			this.contactNo = contactNo;
		}
		public int getDeliveryPesonId() {
			return deliveryPesonId;
		}
		public String getName() {
			return name;
		}
		public long getContactNo() {
			return contactNo;
		}
		@Override
		public String toString() {
			return "DeliveryPerson [deliveryPesonId=" + deliveryPesonId + ", name=" + name + ", contactNo=" + contactNo
					+ "]";
		}
		
		
}
