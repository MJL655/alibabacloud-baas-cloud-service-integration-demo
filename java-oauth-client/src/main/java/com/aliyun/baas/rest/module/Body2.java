/*
 * BaaS API Gateway
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.aliyun.baas.rest.module;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Body2
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-12T03:32:15.669Z[GMT]")
public class Body2 {
  /**
   * Gets or Sets grantType
   */
  public enum GrantTypeEnum {
    CLIENT_CREDENTIALS("client_credentials"),
    REFRESH_TOKEN("refresh_token");

    private String value;

    GrantTypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static GrantTypeEnum fromValue(String text) {
      for (GrantTypeEnum b : GrantTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("grant_type")
  private GrantTypeEnum grantType = GrantTypeEnum.CLIENT_CREDENTIALS;

  /**
   * Default scope is \&quot;\&quot; means all scope. profile: can browse swagger api page and get user info query: can query data from blockchain invoke: can invoke contract and change data in blockchain event: can receive event from subscribe api content_check: can enable content check, to call alibaba Content Moderation oss: can enable query/invoke with file, use oss to store big file 
   */
  public enum ScopeEnum {
    EMPTY(""),
    PROFILE("profile"),
    QUERY("query"),
    INVOKE("invoke"),
    EVENT("event"),
    CONTENT_CHECK("content_check"),
    OSS("oss");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static ScopeEnum fromValue(String text) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("scope")
  private ScopeEnum scope = ScopeEnum.EMPTY;

  @JsonProperty("refresh_token")
  private String refreshToken = null;

  @JsonProperty("access_token_lifetime")
  private Integer accessTokenLifetime = 43200;

  @JsonProperty("refresh_token_lifetime")
  private Integer refreshTokenLifetime = 86400;

  public Body2 grantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
    return this;
  }

   /**
   * Get grantType
   * @return grantType
  **/
  @Schema(description = "")
  public GrantTypeEnum getGrantType() {
    return grantType;
  }

  public void setGrantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
  }

  public Body2 scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Default scope is \&quot;\&quot; means all scope. profile: can browse swagger api page and get user info query: can query data from blockchain invoke: can invoke contract and change data in blockchain event: can receive event from subscribe api content_check: can enable content check, to call alibaba Content Moderation oss: can enable query/invoke with file, use oss to store big file 
   * @return scope
  **/
  @Schema(description = "Default scope is \"\" means all scope. profile: can browse swagger api page and get user info query: can query data from blockchain invoke: can invoke contract and change data in blockchain event: can receive event from subscribe api content_check: can enable content check, to call alibaba Content Moderation oss: can enable query/invoke with file, use oss to store big file ")
  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public Body2 refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Refresh token to refresh access token
   * @return refreshToken
  **/
  @Schema(description = "Refresh token to refresh access token")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public Body2 accessTokenLifetime(Integer accessTokenLifetime) {
    this.accessTokenLifetime = accessTokenLifetime;
    return this;
  }

   /**
   * Access token alive time in seconds, default is 12 hours, maximu is 24 hours.
   * @return accessTokenLifetime
  **/
  @Schema(description = "Access token alive time in seconds, default is 12 hours, maximu is 24 hours.")
  public Integer getAccessTokenLifetime() {
    return accessTokenLifetime;
  }

  public void setAccessTokenLifetime(Integer accessTokenLifetime) {
    this.accessTokenLifetime = accessTokenLifetime;
  }

  public Body2 refreshTokenLifetime(Integer refreshTokenLifetime) {
    this.refreshTokenLifetime = refreshTokenLifetime;
    return this;
  }

   /**
   * Refresh token alive time in seconds, default is 24 hours, -1 means always valid.
   * @return refreshTokenLifetime
  **/
  @Schema(description = "Refresh token alive time in seconds, default is 24 hours, -1 means always valid.")
  public Integer getRefreshTokenLifetime() {
    return refreshTokenLifetime;
  }

  public void setRefreshTokenLifetime(Integer refreshTokenLifetime) {
    this.refreshTokenLifetime = refreshTokenLifetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body2 body2 = (Body2) o;
    return Objects.equals(this.grantType, body2.grantType) &&
        Objects.equals(this.scope, body2.scope) &&
        Objects.equals(this.refreshToken, body2.refreshToken) &&
        Objects.equals(this.accessTokenLifetime, body2.accessTokenLifetime) &&
        Objects.equals(this.refreshTokenLifetime, body2.refreshTokenLifetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantType, scope, refreshToken, accessTokenLifetime, refreshTokenLifetime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body2 {\n");
    
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    accessTokenLifetime: ").append(toIndentedString(accessTokenLifetime)).append("\n");
    sb.append("    refreshTokenLifetime: ").append(toIndentedString(refreshTokenLifetime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
