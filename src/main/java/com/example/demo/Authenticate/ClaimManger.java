package com.example.demo.Authenticate;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import java.util.Date;

public class ClaimManger {

    private Claims claim;

    /**
     * JWT 디코딩 시 나타낼 클레임 추출
     */
    public Claims emitClaim(String subject) {
        claim = Jwts.claims()
                .setSubject(subject)
                .setIssuedAt(claimIssuedAtCurrentTime())
                .setExpiration(claimExpiredAt(claimIssuedAtCurrentTime()));
        return claim;
    }

    /**
     * Claim 정보에 발행시간 추가하기
     */
    private Date claimIssuedAtCurrentTime() {
        return new Date();
    }

    /**
     * Claim 정보에 파기시간(유효시간) 추가하기
     */
    private Date claimExpiredAt(Date date) {
        long tokenValidTime = 1000L * 60 * 60;
        return new Date(date.getTime() + tokenValidTime);
    }

}
