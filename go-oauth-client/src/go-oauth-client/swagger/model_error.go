/*
 * BaaS API Gateway
 *
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * API version: 1.0.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

type ModelError struct {
	// Integer code denoting the type of error. code 200 means request was succeed.
	Code int32 `json:"code"`
	// An error message
	Message string `json:"message"`
	// request id
	RequestId string `json:"request_id,omitempty"`
}