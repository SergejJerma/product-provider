package com.serjer

import com.serjer.model.ClientRequest
import com.serjer.model.EProduct
import com.serjer.model.Product
import com.serjer.service.ClientService
import spock.lang.Specification

class ClientServiceTest extends Specification {

    def service = new ClientService()

    def "should return only JSA product"(){
        setup:
        def request = new ClientRequest("1", true, "1")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 1
        result.contains(new Product(EProduct.JSA.getName()))
    }

    def "should return only JSA product "(){
        setup:
        def request = new ClientRequest("1", false, "1")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 1
        result.contains(new Product(EProduct.JSA.getName()))
    }

    def "should return only JSA product  "(){
        setup:
        def request = new ClientRequest("1", true, "2")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 1
        result.contains(new Product(EProduct.JSA.getName()))
    }

    def "should return only JSA product   "(){
        setup:
        def request = new ClientRequest("1", false, "2")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 1
        result.contains(new Product(EProduct.JSA.getName()))
    }

    def "should return only JSA product    "(){
        setup:
        def request = new ClientRequest("1", true, "3")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 1
        result.contains(new Product(EProduct.JSA.getName()))
    }

    def "should return only JSA product     "(){
        setup:
        def request = new ClientRequest("1", false, "3")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 1
        result.contains(new Product(EProduct.JSA.getName()))
    }

    def "should return only JSA product      "(){
        setup:
        def request = new ClientRequest("1", true, "4")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 1
        result.contains(new Product(EProduct.JSA.getName()))
    }

    def "should return only JSA product       "(){
        setup:
        def request = new ClientRequest("1", false, "4")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 1
        result.contains(new Product(EProduct.JSA.getName()))
    }

    def "should return STA and DC products"(){
        setup:
        def request = new ClientRequest("2", true, "1")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 2
        result.contains(new Product(EProduct.STA.getName()))
        result.contains(new Product(EProduct.DC.getName()))
    }

    def "should return only DC product"(){
        setup:
        def request = new ClientRequest("2", false, "1")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 1
        result.contains(new Product(EProduct.DC.getName()))
    }

    def "should return CA, STA and DC products"(){
        setup:
        def request = new ClientRequest("2", true, "2")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 3
        result.contains(new Product(EProduct.CA.getName()))
        result.contains(new Product(EProduct.STA.getName()))
        result.contains(new Product(EProduct.DC.getName()))
    }

    def "should return CA and DC products"(){
        setup:
        def request = new ClientRequest("2", false, "2")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 2
        result.contains(new Product(EProduct.CA.getName()))
        result.contains(new Product(EProduct.DC.getName()))
    }

    def "should return CA, STA and CC products"(){
        setup:
        def request = new ClientRequest("2", true, "3")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 3
        result.contains(new Product(EProduct.CA.getName()))
        result.contains(new Product(EProduct.STA.getName()))
        result.contains(new Product(EProduct.CC.getName()))
    }

    def "should return CA and CC products"(){
        setup:
        def request = new ClientRequest("2", false, "3")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 2
        result.contains(new Product(EProduct.CA.getName()))
        result.contains(new Product(EProduct.CC.getName()))
    }

    def "should return CA, CAP, STA, CC and GCC products"(){
        setup:
        def request = new ClientRequest("2", true, "4")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 5
        result.contains(new Product(EProduct.CA.getName()))
        result.contains(new Product(EProduct.CAP.getName()))
        result.contains(new Product(EProduct.STA.getName()))
        result.contains(new Product(EProduct.CC.getName()))
        result.contains(new Product(EProduct.GCC.getName()))
    }

    def "should return CA, CAP, CC and GCC products"(){
        setup:
        def request = new ClientRequest("2", false, "4")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 4
        result.contains(new Product(EProduct.CA.getName()))
        result.contains(new Product(EProduct.CAP.getName()))
        result.contains(new Product(EProduct.CC.getName()))
        result.contains(new Product(EProduct.GCC.getName()))
    }

    def "should return STA, SNA and DC products "(){
        setup:
        def request = new ClientRequest("3", true, "1")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 3
        result.contains(new Product(EProduct.STA.getName()))
        result.contains(new Product(EProduct.SNA.getName()))
        result.contains(new Product(EProduct.DC.getName()))
    }

    def "should return STA and DC product"(){
        setup:
        def request = new ClientRequest("3", false, "1")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 2
        result.contains(new Product(EProduct.SNA.getName()))
        result.contains(new Product(EProduct.DC.getName()))
    }

    def "should return CA, STA, SNA and DC products"(){
        setup:
        def request = new ClientRequest("3", true, "2")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 4
        result.contains(new Product(EProduct.CA.getName()))
        result.contains(new Product(EProduct.STA.getName()))
        result.contains(new Product(EProduct.SNA.getName()))
        result.contains(new Product(EProduct.DC.getName()))
    }

    def "should return CA, SNA and DC products"(){
        setup:
        def request = new ClientRequest("3", false, "2")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 3
        result.contains(new Product(EProduct.CA.getName()))
        result.contains(new Product(EProduct.SNA.getName()))
        result.contains(new Product(EProduct.DC.getName()))
    }

    def "should return CA, STA, SNA and CC products"(){
        setup:
        def request = new ClientRequest("3", true, "3")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 4
        result.contains(new Product(EProduct.CA.getName()))
        result.contains(new Product(EProduct.STA.getName()))
        result.contains(new Product(EProduct.SNA.getName()))
        result.contains(new Product(EProduct.CC.getName()))
    }

    def "should return CA, SNA and CC products"(){
        setup:
        def request = new ClientRequest("3", false, "3")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 3
        result.contains(new Product(EProduct.CA.getName()))
        result.contains(new Product(EProduct.SNA.getName()))
        result.contains(new Product(EProduct.CC.getName()))
    }

    def "should return CA, CAP, STA, SNA, CC and GCC products"(){
        setup:
        def request = new ClientRequest("3", true, "4")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 6
        result.contains(new Product(EProduct.CA.getName()))
        result.contains(new Product(EProduct.CAP.getName()))
        result.contains(new Product(EProduct.STA.getName()))
        result.contains(new Product(EProduct.SNA.getName()))
        result.contains(new Product(EProduct.CC.getName()))
        result.contains(new Product(EProduct.GCC.getName()))
    }

    def "should return CA, CAP, SNA, CC and GCC products"(){
        setup:
        def request = new ClientRequest("3", false, "4")

        when:
        def result = service.getProductListByRequest(request)

        then:
        result.size() == 5
        result.contains(new Product(EProduct.CA.getName()))
        result.contains(new Product(EProduct.CAP.getName()))
        result.contains(new Product(EProduct.SNA.getName()))
        result.contains(new Product(EProduct.CC.getName()))
        result.contains(new Product(EProduct.GCC.getName()))
    }
}
