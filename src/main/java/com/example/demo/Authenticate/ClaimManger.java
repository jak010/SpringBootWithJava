package com.example.demo.Authenticate;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import java.util.Date;

public class ClaimManger {

    private Claims claim;

    public Claims emitClaim(String subject) {
        claim = Jwts.claims()
                .setSubject(subject)
                .setIssuedAt(claimIssuedAtCurrentTime())
                .setExpiration(claimExpiredAt(claimIssuedAtCurrentTime()));
        return claim;
    }

    private Date claimIssuedAtCurrentTime() {
        return new Date();
    }

    private Date claimExpiredAt(Date date) {
        long tokenValidTime = 1000L * 60 * 60;
        return new Date(date.getTime() + tokenValidTime);
    }

}
