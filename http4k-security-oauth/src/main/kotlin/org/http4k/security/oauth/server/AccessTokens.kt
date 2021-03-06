package org.http4k.security.oauth.server

import com.natpryce.Result
import org.http4k.security.AccessToken

/**
 * Provides a consistent way to generate access tokens.
 */
interface AccessTokens {
    /**
     * Creates a new access token for a valid authorization code.
     */
    fun create(authorizationCode: AuthorizationCode): Result<AccessToken, AuthorizationCodeAlreadyUsed>

    /**
     * creates a new access token for a given client.
     */
    fun create(clientId: ClientId, tokenRequest: TokenRequest): Result<AccessToken, AccessTokenError>
}