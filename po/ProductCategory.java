package cn.com.wito.auth.po;

import java.util.Date;


/**
 *  商品分类
 * @author FJG
 *
 */
public class ProductCategory {
  
	/** 主键编号 */
    private String id;	
    /** 创建日期 */
    private Date createDate;
    /** 修改日期 */
    private Date updateDate;
    /** 排序 */
    private Integer order;
    /** 层级 */
    private Integer grade;
    /** 名称 */
    private String name;
    /** 页面描述 */
    private String seoDescription;
    /** 页面关键词 */
    private String seoKeywords;
    /** 页面标题 */
    private String seoTitle;
    /** 树路径 */
    private String treePath;
    /** 上级分类 */
    private String parent;
    /** 编号 */
    private String num;

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription == null ? null : seoDescription.trim();
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords == null ? null : seoKeywords.trim();
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle == null ? null : seoTitle.trim();
    }

    public String getTreePath() {
        return treePath;
    }

    public void setTreePath(String treePath) {
        this.treePath = treePath == null ? null : treePath.trim();
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}


	public ProductCategory(String id, Date createDate, Date updateDate,
			Integer order, Integer grade, String name, String seoDescription,
			String seoKeywords, String seoTitle, String treePath,
			String parent, String num) {
		super();
		this.id = id;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.order = order;
		this.grade = grade;
		this.name = name;
		this.seoDescription = seoDescription;
		this.seoKeywords = seoKeywords;
		this.seoTitle = seoTitle;
		this.treePath = treePath;
		this.parent = parent;
		this.num = num;
	}

	public ProductCategory(String id, Integer grade, String name,
			String seoDescription, String seoKeywords, String seoTitle,
			String treePath, String parent, String num) {
		super();
		this.id = id;
		this.grade = grade;
		this.name = name;
		this.seoDescription = seoDescription;
		this.seoKeywords = seoKeywords;
		this.seoTitle = seoTitle;
		this.treePath = treePath;
		this.parent = parent;
		this.num = num;
	}
   
	public ProductCategory() {
		super();
	}

	public String toString(){
		   return "ProductCategory [id=" + id + ",createDate=" + createDate + ",updateDate=" + updateDate + ",order=" + order + ",grade=" + grade + ", name=" + name + ", seoDescription="
					+ seoDescription + ", seoKeywords=" + seoKeywords + ", seoTitle="
					+ seoTitle + ", treePath=" + treePath + ", parent="
					+ parent + ", num=" + num + "]";
	   }
}