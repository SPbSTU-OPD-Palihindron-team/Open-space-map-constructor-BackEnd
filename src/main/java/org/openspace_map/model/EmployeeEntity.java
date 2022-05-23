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
public class EmployeeEntity   {
  
  private String name;
  private String surname;
  private String patronymic;
  private String email;
  private String telephone;
  private String specialization;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("surname")
  @NotNull
  public String getSurname() {
    return surname;
  }
  public void setSurname(String surname) {
    this.surname = surname;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("patronymic")
  public String getPatronymic() {
    return patronymic;
  }
  public void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("email")
  @NotNull
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("telephone")
  public String getTelephone() {
    return telephone;
  }
  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("specialization")
  public String getSpecialization() {
    return specialization;
  }
  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeEntity employeeEntity = (EmployeeEntity) o;
    return Objects.equals(name, employeeEntity.name) &&
        Objects.equals(surname, employeeEntity.surname) &&
        Objects.equals(patronymic, employeeEntity.patronymic) &&
        Objects.equals(email, employeeEntity.email) &&
        Objects.equals(telephone, employeeEntity.telephone) &&
        Objects.equals(specialization, employeeEntity.specialization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, surname, patronymic, email, telephone, specialization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeEntity {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    patronymic: ").append(toIndentedString(patronymic)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    specialization: ").append(toIndentedString(specialization)).append("\n");
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

