package com.resumeBuilder.model.user;

import java.io.Serializable;


public  class UserProjectDtls implements Serializable {

		private String prjTitle;
		private String prjDescription;
		private String prjNoOfMembers;
		
		public UserProjectDtls(String prjTitle, String prjDescription, String prjNoOfMembers) {
			this.prjTitle = prjTitle;
			this.prjDescription = prjDescription;
			this.prjNoOfMembers = prjNoOfMembers;
		}
		
		public String getPrjTitle() {
			return prjTitle;
		}
		public void setPrjTitle(String prjTitle) {
			this.prjTitle = prjTitle;
		}
		public String getPrjDescription() {
			return prjDescription;
		}
		public void setPrjDescription(String prjDescription) {
			this.prjDescription = prjDescription;
		}
		public String getPrjNoOfMembers() {
			return prjNoOfMembers;
		}
		public void setPrjNoOfMembers(String prjNoOfMembers) {
			this.prjNoOfMembers = prjNoOfMembers;
		}
		
		
}
