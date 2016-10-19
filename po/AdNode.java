package cn.com.wito.auth.po;

import java.io.Serializable;


/**
 * 网点实体
 * 
 * @author baibingge
 * 
 */
public class AdNode implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1354165837089594706L;

	
	private Long id;

    private String nodeCode;

    private String nodeName1;

    private Integer nodeStatus;

    private String attributeValue0;

    private String attributeValue1;

    private String attributeValue2;

    private String attributeValue3;



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNodeCode() {
        return nodeCode;
    }

    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode == null ? null : nodeCode.trim();
    }
    

    public String getNodeName1() {
		return nodeName1;
	}

	public void setNodeName1(String nodeName1) {
		this.nodeName1 = nodeName1== null ? null : nodeName1.trim();
	}

	public Integer getNodeStatus() {
        return nodeStatus;
    }

    public void setNodeStatus(Integer nodeStatus) {
        this.nodeStatus = nodeStatus;
    }

    public String getAttributeValue0() {
        return attributeValue0;
    }

    public void setAttributeValue0(String attributeValue0) {
        this.attributeValue0 = attributeValue0 == null ? null : attributeValue0.trim();
    }

    public String getAttributeValue1() {
        return attributeValue1;
    }

    public void setAttributeValue1(String attributeValue1) {
        this.attributeValue1 = attributeValue1 == null ? null : attributeValue1.trim();
    }

    public String getAttributeValue2() {
        return attributeValue2;
    }

    public void setAttributeValue2(String attributeValue2) {
        this.attributeValue2 = attributeValue2 == null ? null : attributeValue2.trim();
    }

    public String getAttributeValue3() {
        return attributeValue3;
    }

    public void setAttributeValue3(String attributeValue3) {
        this.attributeValue3 = attributeValue3 == null ? null : attributeValue3.trim();
    }

	public AdNode() {
		super();
	}

	public AdNode(Long id, String nodeCode, String NodeName1,
			Integer nodeStatus, String attributeValue0, String attributeValue1,
			String attributeValue2, String attributeValue3) {
		super();
		this.id = id;
		this.nodeCode = nodeCode;
		this.nodeName1 = NodeName1;
		this.nodeStatus = nodeStatus;
		this.attributeValue0 = attributeValue0;
		this.attributeValue1 = attributeValue1;
		this.attributeValue2 = attributeValue2;
		this.attributeValue3 = attributeValue3;
	}

	public AdNode(String nodeCode, String NodeName1, Integer nodeStatus,
			String attributeValue0, String attributeValue1,
			String attributeValue2, String attributeValue3) {
		super();
		this.nodeCode = nodeCode;
		this.nodeName1 = NodeName1;
		this.nodeStatus = nodeStatus;
		this.attributeValue0 = attributeValue0;
		this.attributeValue1 = attributeValue1;
		this.attributeValue2 = attributeValue2;
		this.attributeValue3 = attributeValue3;
	}
	
	@Override
	public String toString() {
		return "AdNode [id=" + id + ", nodecode=" + nodeCode + ", nodeName1="
				+ nodeName1 + ", nodestatus=" + nodeStatus +"]";
	}


}