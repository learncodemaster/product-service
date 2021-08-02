package com.ps.api.dto;

import java.util.List;

public class Metadata2{
    public List<String> asset_usage;
    public String imageStyle;
    public String view;
    public String usageTerms;
    public String sortOrder;
    public List<Object> subjects;
	public List<String> getAsset_usage() {
		return asset_usage;
	}
	public void setAsset_usage(List<String> asset_usage) {
		this.asset_usage = asset_usage;
	}
	public String getImageStyle() {
		return imageStyle;
	}
	public void setImageStyle(String imageStyle) {
		this.imageStyle = imageStyle;
	}
	public String getView() {
		return view;
	}
	public void setView(String view) {
		this.view = view;
	}
	public String getUsageTerms() {
		return usageTerms;
	}
	public void setUsageTerms(String usageTerms) {
		this.usageTerms = usageTerms;
	}
	public String getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}
	public List<Object> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Object> subjects) {
		this.subjects = subjects;
	}
    
    
}
