package org.openspace_map.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class RegisteredUser   {
  
  private Integer userId;
  private String login;
  private String password;
  private String accessebilityType;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("user_id")
  @NotNull
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * login is an email of user 
   **/
  
  @ApiModelProperty(required = true, value = "login is an email of user ")
  @JsonProperty("login")
  @NotNull
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("password")
  @NotNull
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Enum of: - ADMIN - USER
   **/
  
  @ApiModelProperty(value = "Enum of: - ADMIN - USER")
  @JsonProperty("accessebilityType")
  public String getAccessebilityType() {
    return accessebilityType;
  }
  public void setAccessebilityType(String accessebilityType) {
    this.accessebilityType = accessebilityType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisteredUser registeredUser = (RegisteredUser) o;
    return Objects.equals(userId, registeredUser.userId) &&
        Objects.equals(login, registeredUser.login) &&
        Objects.equals(password, registeredUser.password) &&
        Objects.equals(accessebilityType, registeredUser.accessebilityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, login, password, accessebilityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisteredUser {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    accessebilityType: ").append(toIndentedString(accessebilityType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

