package org.smart4j.chapter2.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Customer {
  /**
   * 主键ID
   */
  private long id;

  /**
   * 客户名称
   */
  private String name;

  /**
   * 联系人
   */
  private String contact;

  /**
   * 电话
   */
  private String telephone;

  /**
   * 邮箱地址
   */
  private String email;

  /**
   * 备注
   */
  private String remark;
}