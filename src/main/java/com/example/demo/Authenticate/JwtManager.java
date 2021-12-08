package com.example.demo.Authenticate;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;


@Component
public class JwtManager {

    private SecretKey key = Keys.hmacShaKeyFor("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
            .getBytes(StandardCharsets.UTF_8)); // Signature

    private JSONObject token = new JSONObject();
    private ClaimManger claimManger = new ClaimManger();


    /**
     * JWT 발급하기 <br/>
     * - createToken을 통해 인증에 사용할 JWT 발급하기
     */
    public String publish() {
        setToken("x-access-token", this.createToken());
        return token.toString();
    }


    /**
     * JWT 검증 <br/>
     */
    public Claims verify(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    /**
     * JWT 생성하는 메서드. <br/>
     * - TEST 를 위해 Claim 정보는 토큰 생성 시점에 임의로 넣어줍니다 <br/>
     */
    private String createToken() {
        return Jwts.builder()
                .setClaims(receiveClaimByManger())
                .signWith(key)
                .compact();
    }

    private void setToken(String key, String value) {
        token.put(key, value);
    }

    private Claims receiveClaimByManger() {
        return claimManger.emitClaim("test");
    }

}
