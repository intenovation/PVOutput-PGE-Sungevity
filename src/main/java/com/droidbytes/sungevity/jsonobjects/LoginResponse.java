package com.droidbytes.sungevity.jsonobjects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponse {

	@SerializedName("scope")
	@Expose
	private String scope;
	@SerializedName("token_type")
	@Expose
	private String tokenType;
	@SerializedName("expires_in")
	@Expose
	private int expiresIn;
	@SerializedName("refresh_token")
	@Expose
	private String refreshToken;
	@SerializedName("access_token")
	@Expose
	private String accessToken;

	/**
	 * 
	 * @return The scope
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * 
	 * @param scope
	 *            The scope
	 */
	public void setScope(String scope) {
		this.scope = scope;
	}

	/**
	 * 
	 * @return The tokenType
	 */
	public String getTokenType() {
		return tokenType;
	}

	/**
	 * 
	 * @param tokenType
	 *            The token_type
	 */
	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	/**
	 * 
	 * @return The expiresIn
	 */
	public int getExpiresIn() {
		return expiresIn;
	}

	/**
	 * 
	 * @param expiresIn
	 *            The expires_in
	 */
	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}

	/**
	 * 
	 * @return The refreshToken
	 */
	public String getRefreshToken() {
		return refreshToken;
	}

	/**
	 * 
	 * @param refreshToken
	 *            The refresh_token
	 */
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	/**
	 * 
	 * @return The accessToken
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * 
	 * @param accessToken
	 *            The access_token
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

}