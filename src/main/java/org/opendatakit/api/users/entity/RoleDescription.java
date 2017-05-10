package org.opendatakit.api.users.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "roleDescription")
@JsonRootName("roleDescription")
public class RoleDescription {

  @JsonProperty(required = false)
  String role;
  @JsonProperty(required = false)
  String name;
  @JsonProperty(required = false)
  String description;
  
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  
  
}
