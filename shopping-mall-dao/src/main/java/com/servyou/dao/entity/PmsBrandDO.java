package com.servyou.dao.entity;

import javax.persistence.*;

@Table(name = "pms_brand")
public class PmsBrandDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    /**
     * 首字母
     */
    @Column(name = "first_letter")
    private String firstLetter;

    private Integer sort;

    /**
     * 是否为品牌制造商：0->不是；1->是
     */
    @Column(name = "factory_status")
    private Integer factoryStatus;

    @Column(name = "show_status")
    private Integer showStatus;

    /**
     * 产品数量
     */
    @Column(name = "product_count")
    private Integer productCount;

    /**
     * 产品评论数量
     */
    @Column(name = "product_comment_count")
    private Integer productCommentCount;

    /**
     * 品牌logo
     */
    private String logo;

    /**
     * 专区大图
     */
    @Column(name = "big_pic")
    private String bigPic;

    /**
     * 品牌故事
     */
    @Column(name = "brand_story")
    private String brandStory;

    public PmsBrandDO(Long id, String name, String firstLetter, Integer sort, Integer factoryStatus, Integer showStatus, Integer productCount, Integer productCommentCount, String logo, String bigPic, String brandStory) {
        this.id = id;
        this.name = name;
        this.firstLetter = firstLetter;
        this.sort = sort;
        this.factoryStatus = factoryStatus;
        this.showStatus = showStatus;
        this.productCount = productCount;
        this.productCommentCount = productCommentCount;
        this.logo = logo;
        this.bigPic = bigPic;
        this.brandStory = brandStory;
    }

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 获取首字母
     *
     * @return first_letter - 首字母
     */
    public String getFirstLetter() {
        return firstLetter;
    }

    /**
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 获取是否为品牌制造商：0->不是；1->是
     *
     * @return factory_status - 是否为品牌制造商：0->不是；1->是
     */
    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    /**
     * @return show_status
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * 获取产品数量
     *
     * @return product_count - 产品数量
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * 获取产品评论数量
     *
     * @return product_comment_count - 产品评论数量
     */
    public Integer getProductCommentCount() {
        return productCommentCount;
    }

    /**
     * 获取品牌logo
     *
     * @return logo - 品牌logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 获取专区大图
     *
     * @return big_pic - 专区大图
     */
    public String getBigPic() {
        return bigPic;
    }

    /**
     * 获取品牌故事
     *
     * @return brand_story - 品牌故事
     */
    public String getBrandStory() {
        return brandStory;
    }
}