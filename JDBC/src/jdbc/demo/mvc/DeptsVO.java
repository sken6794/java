package jdbc.demo.mvc;

public class DeptsVO {//DTO
	
	//데이터베이스의 컬럼값을 가지고 다닐 클래스
	//만드는 규칙
	//1. 데이터베이스 컬럼을 멤버변수로 선언, 은닉
	//2. 생성자는 2개 만듬
	//3. getter , setter 
	
	/*
	 *  DEPARTMENT_ID   NOT NULL NUMBER(4)    
		DEPARTMENT_NAME NOT NULL VARCHAR2(30) 
		MANAGER_ID               NUMBER(6)    
		LOCATION_ID              NUMBER(4) 
	 */
	private int department_id;
	private String department_name;
	private int manager_id;
	private int location_id;
	
	public DeptsVO() {
		
	}

	public DeptsVO(int department_id, String department_name, int manager_id, int location_id) {
		super();
		this.department_id = department_id;
		this.department_name = department_name;
		this.manager_id = manager_id;
		this.location_id = location_id;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	
	
}
