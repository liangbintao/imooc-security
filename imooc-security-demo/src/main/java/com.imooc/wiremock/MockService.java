package com.imooc.wiremock;

import com.github.tomakehurst.wiremock.client.WireMock;

/**
 * @ClassName MockService
 * @Description TODO
 * @Auther lbt
 * @Date 2019/5/3/003 16:32
 * @Version 1.0
 */
public class MockService {

    public static void main(String[] args) {

        WireMock.configureFor(8062);
        WireMock.removeAllMappings();

        WireMock.stubFor(WireMock.get(WireMock.urlEqualTo("/order/1")).willReturn(WireMock.aResponse()
                .withBody("{\"id\":1}").withStatus(200)));
    }
}
