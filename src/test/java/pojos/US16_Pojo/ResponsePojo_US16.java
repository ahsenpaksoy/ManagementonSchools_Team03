package pojos.US16_Pojo;

import java.io.Serializable;

public class ResponsePojo_US16 implements Serializable {
	private ObjectPojo_US16 object;
	private String message;
	private String httpStatus;

	public void setObject(ObjectPojo_US16 object){
		this.object = object;
	}

	public ObjectPojo_US16 getObject(){
		return object;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setHttpStatus(String httpStatus){
		this.httpStatus = httpStatus;
	}

	public String getHttpStatus(){
		return httpStatus;
	}

	@Override
 	public String toString(){
		return 
			"ResponsePojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}