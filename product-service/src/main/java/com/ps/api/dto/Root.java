package com.ps.api.dto;

import java.util.List;

public class Root{
    public String id;
    public String product_type;
    public String model_number;
    public String name;
    public MetaData meta_data;
    public List<ViewList> view_list;
    public AttributeList attribute_list;
    public List<BreadcrumbList> breadcrumb_list;
    public PricingInformation pricing_information;
    public ProductDescription product_description;
    public boolean recommendationsEnabled;
    public List<ProductLinkList> product_link_list;
    public Embellishment embellishment;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProduct_type() {
		return product_type;
	}
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}
	public String getModel_number() {
		return model_number;
	}
	public void setModel_number(String model_number) {
		this.model_number = model_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MetaData getMeta_data() {
		return meta_data;
	}
	public void setMeta_data(MetaData meta_data) {
		this.meta_data = meta_data;
	}
	public List<ViewList> getView_list() {
		return view_list;
	}
	public void setView_list(List<ViewList> view_list) {
		this.view_list = view_list;
	}
	public AttributeList getAttribute_list() {
		return attribute_list;
	}
	public void setAttribute_list(AttributeList attribute_list) {
		this.attribute_list = attribute_list;
	}
	public List<BreadcrumbList> getBreadcrumb_list() {
		return breadcrumb_list;
	}
	public void setBreadcrumb_list(List<BreadcrumbList> breadcrumb_list) {
		this.breadcrumb_list = breadcrumb_list;
	}
	public PricingInformation getPricing_information() {
		return pricing_information;
	}
	public void setPricing_information(PricingInformation pricing_information) {
		this.pricing_information = pricing_information;
	}
	public ProductDescription getProduct_description() {
		return product_description;
	}
	public void setProduct_description(ProductDescription product_description) {
		this.product_description = product_description;
	}
	public boolean isRecommendationsEnabled() {
		return recommendationsEnabled;
	}
	public void setRecommendationsEnabled(boolean recommendationsEnabled) {
		this.recommendationsEnabled = recommendationsEnabled;
	}
	public List<ProductLinkList> getProduct_link_list() {
		return product_link_list;
	}
	public void setProduct_link_list(List<ProductLinkList> product_link_list) {
		this.product_link_list = product_link_list;
	}
	public Embellishment getEmbellishment() {
		return embellishment;
	}
	public void setEmbellishment(Embellishment embellishment) {
		this.embellishment = embellishment;
	}
    
    
	public class WashCareInstructions{
	    public List<Object> care_instructions;
	}

	public class DescriptionAssets{
	    public String image_url;
	    public Object video_url;
	    public Object poster_url;
		public String getImage_url() {
			return image_url;
		}
		public void setImage_url(String image_url) {
			this.image_url = image_url;
		}
		public Object getVideo_url() {
			return video_url;
		}
		public void setVideo_url(Object video_url) {
			this.video_url = video_url;
		}
		public Object getPoster_url() {
			return poster_url;
		}
		public void setPoster_url(Object poster_url) {
			this.poster_url = poster_url;
		}
	    
	    
	}

	public class ProductDescription{
	    public String title;
	    public String text;
	    public String subtitle;
	    public List<String> usps;
	    public WashCareInstructions wash_care_instructions;
	    public DescriptionAssets description_assets;
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public String getSubtitle() {
			return subtitle;
		}
		public void setSubtitle(String subtitle) {
			this.subtitle = subtitle;
		}
		public List<String> getUsps() {
			return usps;
		}
		public void setUsps(List<String> usps) {
			this.usps = usps;
		}
		public WashCareInstructions getWash_care_instructions() {
			return wash_care_instructions;
		}
		public void setWash_care_instructions(WashCareInstructions wash_care_instructions) {
			this.wash_care_instructions = wash_care_instructions;
		}
		public DescriptionAssets getDescription_assets() {
			return description_assets;
		}
		public void setDescription_assets(DescriptionAssets description_assets) {
			this.description_assets = description_assets;
		}
	    
	    
	}

	public class ProductLinkList{
	    public String type;
	    public String productId;
	    public String name;
	    public String url;
	    public String image;
	    public String altImage;
	    public PricingInformation pricing_information;
	    public String search_color;
	    public String default_color;
	    public String source;
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getProductId() {
			return productId;
		}
		public void setProductId(String productId) {
			this.productId = productId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public String getAltImage() {
			return altImage;
		}
		public void setAltImage(String altImage) {
			this.altImage = altImage;
		}
		public PricingInformation getPricing_information() {
			return pricing_information;
		}
		public void setPricing_information(PricingInformation pricing_information) {
			this.pricing_information = pricing_information;
		}
		public String getSearch_color() {
			return search_color;
		}
		public void setSearch_color(String search_color) {
			this.search_color = search_color;
		}
		public String getDefault_color() {
			return default_color;
		}
		public void setDefault_color(String default_color) {
			this.default_color = default_color;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
	    
	    
	}

	public class Field{
	    public String type;
	    public String key;
	    public int maxLength;
	    public int minLength;
	    public String validation;
	    public String textColor;
	    public boolean usesStock;
	    public Object stockCollection;
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public int getMaxLength() {
			return maxLength;
		}
		public void setMaxLength(int maxLength) {
			this.maxLength = maxLength;
		}
		public int getMinLength() {
			return minLength;
		}
		public void setMinLength(int minLength) {
			this.minLength = minLength;
		}
		public String getValidation() {
			return validation;
		}
		public void setValidation(String validation) {
			this.validation = validation;
		}
		public String getTextColor() {
			return textColor;
		}
		public void setTextColor(String textColor) {
			this.textColor = textColor;
		}
		public boolean isUsesStock() {
			return usesStock;
		}
		public void setUsesStock(boolean usesStock) {
			this.usesStock = usesStock;
		}
		public Object getStockCollection() {
			return stockCollection;
		}
		public void setStockCollection(Object stockCollection) {
			this.stockCollection = stockCollection;
		}
	    
	    
	}

	public class EmbellishmentOption{
	    public String position;
	    public int positionPrice;
	    public boolean allowChooseOwnText;
	    public List<Field> fields;
		public String getPosition() {
			return position;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		public int getPositionPrice() {
			return positionPrice;
		}
		public void setPositionPrice(int positionPrice) {
			this.positionPrice = positionPrice;
		}
		public boolean isAllowChooseOwnText() {
			return allowChooseOwnText;
		}
		public void setAllowChooseOwnText(boolean allowChooseOwnText) {
			this.allowChooseOwnText = allowChooseOwnText;
		}
		public List<Field> getFields() {
			return fields;
		}
		public void setFields(List<Field> fields) {
			this.fields = fields;
		}
	    
	    
	}

	public class Embellishment{
	    public List<EmbellishmentOption> embellishmentOptions;
	    public String articleType;
		public List<EmbellishmentOption> getEmbellishmentOptions() {
			return embellishmentOptions;
		}
		public void setEmbellishmentOptions(List<EmbellishmentOption> embellishmentOptions) {
			this.embellishmentOptions = embellishmentOptions;
		}
		public String getArticleType() {
			return articleType;
		}
		public void setArticleType(String articleType) {
			this.articleType = articleType;
		}
	    
	    
	}
}