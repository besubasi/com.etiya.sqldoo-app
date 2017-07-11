package com.etiya.sqldoo.util;

public final class SqlDooEnums {
	
	
	
	public enum ClearSettle {
		
		LOGIN("https://testreportingapi.clearsettle.com/api/v3/merchant/user/login"),
		TRANSACTIONS_REPORT("https://testreportingapi.clearsettle.com/api/v3/transactions/report"),
		TRANSACTION_LIST("https://testreportingapi.clearsettle.com/api/v3/transaction/list"),
		TRANSACTION("https://testreportingapi.clearsettle.com/api/v3/transaction"),
		CLIENT("https://testreportingapi.clearsettle.com/api/v3/client"),
		MERCHANT("https://testreportingapi.clearsettle.com/api/v3/merchant");
		
		private String url;

		ClearSettle(String url) {
	        this.url = url;
	    }

	    public String getUrl() {
	        return url;
	    }
	    
	    @Override
	    public String toString() {
	        return this.getUrl();
	    }
	    

	}


}
