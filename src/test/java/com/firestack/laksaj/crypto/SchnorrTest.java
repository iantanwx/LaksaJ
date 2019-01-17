package com.firestack.laksaj.crypto;

import com.firestack.laksaj.utils.ByteUtil;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SchnorrTest {
    @Test
    public void sign() {
        String publicKey = "039E43C9810E6CC09F46AAD38E716DAE3191629534967DC457D3A687D2E2CDDC6A";
        String privateKey = "0F494B8312E8D257E51730C78F8FE3B47B6840C59AAAEC7C2EBE404A2DE8B25A";
        String message = "A7F1D92A82C8D8FE434D98558CE2B347171198542F112D0558F56BD68807999248336241F30D23E55F30D1C8ED610C4B0235398184B814A29CB45A672ACAE548E9C5F1B0C4158AE59B4D39F6F7E8A105D3FEEDA5D5F3D9E45BFA6CC351E220AE0CE106986D61FF34A11E19FD3650E9B7818FC33A1E0FC02C44557AC8AB50C9B2DEB2F6B5E24C4FDD9F8867BDCE1FF261008E7897970E346207D75E47A158298E5BA2F56246869CC42E362A02731264E60687EF5309D108534F51F8658FB4F080B7CB19EE9AEBD718CC4FA27C8C37DFC1ADA5D133D13ABE03F021E9B1B78CCBD82F7FF2B38C6D48D01E481B2D4FAF7171805FD7F2D39EF4C4F19B9496E81DAB8193B3737E1B27D9C43957166441B93515E8F03C95D8E8CE1E1864FAAD68DDFC5932130109390B0F1FE5CA716805F8362E98DCCAADC86ADBED25801A9A9DCFA6264319DDAFE83A89C51F3C6D199D38DE10E660C37BE872C3F2B31660DE8BC95902B9103262CDB941F77376F5D3DBB7A3D5A387797FC4819A035ECA704CEDB37110EE7F206B0C8805AAEBF4963E7C4708CE8D4E092366E71792A8A3B2BBCDEE321B3E15380C541EF0930888969F7457AFE18588826A419D58311C1784B5484EECDB393F6A0ACA11B91DF0866B500B8DEE501FD7EB9BCE09A17D74124B4605ADFC0777BED9816D8D7E8488544A18D8045CB3283B0A752B881B5F500FADB59010E63D";
        String k = "532B2267C4A3054F380B3357339BDFB379E88366FE61B42ACA05F69BC3F6F54E";


        Signature signature = Schnorr.trySign(ByteUtil.hexStringToByteArray(privateKey), ByteUtil.hexStringToByteArray(publicKey),
                ByteUtil.hexStringToByteArray(message), new BigInteger(k, 16));
        Assert.assertEquals(signature.getR().toString(16).toUpperCase(), "3AF3D288E830E96FF8ED0769F45ABDA774CD989E2AE32EF9E985C8505F14FF98");
        Assert.assertEquals(signature.getS().toString(16).toUpperCase(), "E191EB14A70B5B53ADA45AFFF4A04578F5D8BB2B1C8A22985EA159B53826CDE7");


        publicKey = "02237627FE7374061FBD80AEA842DCE76D9206F0DDC7B319F3B30FA75DBD4F009A";
        privateKey = "009755F442D66585A10B80A49850C77764AD029D1BEA73F4DA45AB331306E6E5";
        message = "3444C8501F19A8A78670F748FA401C4020AE086D7157A3837EC721DEF0D6E095928C5B78ED9B95560CE33D5B22778BE66DCEF2D21878D481DFF41A4DEDCAFDCAEAB4BD78629D7EC40FD26F1DD954CA84A3B53B84E9903056E840837A1390F37BB8ADE799DAC1E465D811916547EB4B6A163082E9833634A1224C54F681B8DC70A792C0CB4671D4970CCC80E2168CE920CC8FA07B1F90E9898D16019913ED5B8EE8A8DE7AB6F7895601FD20E49FD73E6F5D24C0D97E67871539F0E4E32CCB6677AFF03356D1F3790945E94039E51A63B3C840B74E3053D95CA71C0D3AC20A9065828D30AB5BFB6188A8F291FB1EB4E1EED03E2F5F558C00D8E3084120DEEB8BFE908429B36A896A45D624E79372CC18DF37DB2D20C9726D4FEF7BECF220138B53BC54C2DA461A9955AFF33F2F93DD96464BF3E883FC5750BDBE79BC2F82427F41DE42659AC4B111D7CEF8085003469DF8C9D3541480C6841707CE4C8F3D003AF982AD35C2733D0FA3B1EE52A6DAB36203D99AEC179A565B5050F480235C3BC560AA28EF5DD5525BFA254E584A86FDBD4BCC5B56551BAD00255CB72F806D7F3C533321B0864007AFBA4E0FF9638517FA8D788F52766F3A28C57C428BFDD4234AA760CE8044DF1E1FBA58E8B1D9C5A79D2AC4592FC31702F7E83351D2160C09C5CEA554F2C93A61C040E225612DF2B550900B097E18638350E3BA15C9AD53CE1861";
        k = "2D78C77B736AD0A00FDF60695C01E96520656C13DC890A5B864672C6CED1C49A";
        signature = Schnorr.trySign(ByteUtil.hexStringToByteArray(privateKey), ByteUtil.hexStringToByteArray(publicKey),
                ByteUtil.hexStringToByteArray(message), new BigInteger(k, 16));
        Assert.assertEquals(signature.getR().toString(16).toUpperCase(), "4B73D4D919D7B4DEF330391899EA02023851CABE044E34E18EAE3E10588CECCD");
        Assert.assertEquals(signature.getS().toString(16).toUpperCase(), "D5DE85C4BDEA5910DC36AEF5660774D65291322C1E87FDA0D00C864E8C5FED29");

        publicKey = "0246e7178dc8253201101e18fd6f6eb9972451d121fc57aa2a06dd5c111e58dc6a";
        privateKey = "e19d05c5452598e24caad4a0d85a49146f7be089515c905ae6a19e8a578a6930";
        message = "080010001a142e3c9b415b19ae4035503a06192a0fad76e0424322230a210246e7178dc8253201101e18fd6f6eb9972451d121fc57aa2a06dd5c111e58dc6a2a120a100000000000000000000000000000271032120a100000000000000000000000000000006438e80742004a00";
        k = "4b33d1e9da7e4f5378cd498e6e68a62d91a52c7a4ae38dd871a5feef8b83189b";
        signature = Schnorr.trySign(ByteUtil.hexStringToByteArray(privateKey), ByteUtil.hexStringToByteArray(publicKey),
                ByteUtil.hexStringToByteArray(message), new BigInteger(k, 16));
        System.out.println(signature);
    }

    @Test
    public void verify() {
        String message = "A7F1D92A82C8D8FE434D98558CE2B347171198542F112D0558F56BD68807999248336241F30D23E55F30D1C8ED610C4B0235398184B814A29CB45A672ACAE548E9C5F1B0C4158AE59B4D39F6F7E8A105D3FEEDA5D5F3D9E45BFA6CC351E220AE0CE106986D61FF34A11E19FD3650E9B7818FC33A1E0FC02C44557AC8AB50C9B2DEB2F6B5E24C4FDD9F8867BDCE1FF261008E7897970E346207D75E47A158298E5BA2F56246869CC42E362A02731264E60687EF5309D108534F51F8658FB4F080B7CB19EE9AEBD718CC4FA27C8C37DFC1ADA5D133D13ABE03F021E9B1B78CCBD82F7FF2B38C6D48D01E481B2D4FAF7171805FD7F2D39EF4C4F19B9496E81DAB8193B3737E1B27D9C43957166441B93515E8F03C95D8E8CE1E1864FAAD68DDFC5932130109390B0F1FE5CA716805F8362E98DCCAADC86ADBED25801A9A9DCFA6264319DDAFE83A89C51F3C6D199D38DE10E660C37BE872C3F2B31660DE8BC95902B9103262CDB941F77376F5D3DBB7A3D5A387797FC4819A035ECA704CEDB37110EE7F206B0C8805AAEBF4963E7C4708CE8D4E092366E71792A8A3B2BBCDEE321B3E15380C541EF0930888969F7457AFE18588826A419D58311C1784B5484EECDB393F6A0ACA11B91DF0866B500B8DEE501FD7EB9BCE09A17D74124B4605ADFC0777BED9816D8D7E8488544A18D8045CB3283B0A752B881B5F500FADB59010E63D";
        String R = "3AF3D288E830E96FF8ED0769F45ABDA774CD989E2AE32EF9E985C8505F14FF98";
        String S = "E191EB14A70B5B53ADA45AFFF4A04578F5D8BB2B1C8A22985EA159B53826CDE7";
        String publicKey = "039E43C9810E6CC09F46AAD38E716DAE3191629534967DC457D3A687D2E2CDDC6A";
        List<Integer> messageList = new ArrayList<>();
        for (byte m : ByteUtil.hexStringToByteArray(message)) {
            messageList.add((int) m);
        }
        boolean result = Schnorr.verify(messageList, new BigInteger(R, 16), new BigInteger(S, 16), ByteUtil.hexStringToByteArray(publicKey));
        Assert.assertTrue(result);

        message = "C2C01572CCD4C92848619B06B698B05FF87BE752BE1DB3AF39956F20B8972313BC238CFB4919BE95C4E1D9059F05377EAF1DEDFA70CAFA38DBBD3016B17E1F49E95E859F492BAA80F5C921ED47244B667001E93C42812674EDCB3D2133D0E55CE84D647432A8F1965C8C58CDB6A9B0C38163D5BC45AF9DF9FBAE417C0EAD32CE4CDEB147603CEE0D7BC1E2CCA8EB99EE62E3A864427BD100C9D6DD5F5A7759DF702B63F26E3C5D82A90B06F157857A06158B3FDDDD4A9B12ACF821D1570D049B6B65B836151D19F9BF01461EFEEEF4D34F3BDB1DB0687B82E4F21C2FA108234CB63A76C5807EF884CD532C3FC39D36F008CB0A6809A2FAEC103B688FA3F43460CAFBB96928ECCAA6D34D385B85B45649EFCDFCA538474D994988B4D5FBFC050DFE409B750724FFCC9B620F0AB33F8A7E27E14F5CEDC2DEE6F58A27D5166B8733117A55F06813C96D61930D6FC240232127F702D43A2EA2353C99D8651E61CF304993F35CED64A7970F97A8B9C51EDB2FB4E6997FB23F58335C28B354AE279D263B943372AF5CB55CEC17C2CA71CA5CA3EE7A008B37CBD9F02238DE7C2695021D51161CAC6C6B7E5A5E2D5DAE3FCCB9B1D1F9474F7FC50288A799DA6CADD671FD89A4263F6457AB3FC29092DD0CBDAAA40B2F75E20A1E856C51EBA15775802920816D6B94316ED451F867B8569C066E357787B2FDB4DAA7C249FF050DCE5A4669";
        R = "1D6C892D8459E7CD26716FF83879C76838414C4F754A2B18FA7AC1ED5E446821";
        S = "43F7D3169425447E3786D82525F6B1AA10A072733C66340EC0280BAEAE5CAC9B";
        publicKey = "03F9A562AAD4BFF0A519D27DA65492ABB8CE68611A1B20B652E236153FCE3FE477";
        messageList = new ArrayList<>();
        for (byte m : ByteUtil.hexStringToByteArray(message)) {
            messageList.add((int) m);
        }
        result = Schnorr.verify(messageList, new BigInteger(R, 16), new BigInteger(S, 16), ByteUtil.hexStringToByteArray(publicKey));
        Assert.assertTrue(result);

        message = "088880F80110221A15FF4BAF5FADA8E5DB92C3D3242618C5B47133AE003C22230A210246E7178DC8253201101E18FD6F6EB9972451D121FC57AA2A06DD5C111E58DC6A2A120A100000000000000000000000000098968032120A100000000000000000000000003B9ACA00380142004A00";
        R = "a8509645136258318981a803278a072ac374ced8e2a243dfe5489b7e077adbd";
        S = "2f25839ecd8a59a1859225674f4820801144aec92608be8bae8de72672e625ce";
        publicKey = "0246E7178DC8253201101E18FD6F6EB9972451D121FC57AA2A06DD5C111E58DC6A";
        messageList = new ArrayList<>();
        for (byte m : ByteUtil.hexStringToByteArray(message)) {
            messageList.add((int) m);
        }
        result = Schnorr.verify(messageList, new BigInteger(R, 16), new BigInteger(S, 16), ByteUtil.hexStringToByteArray(publicKey));
        Assert.assertTrue(result);
    }

    @Test
    public void getDRBG() {
        String message = "A7F1D92A82C8D8FE434D98558CE2B347171198542F112D0558F56BD68807999248336241F30D23E55F30D1C8ED610C4B0235398184B814A29CB45A672ACAE548E9C5F1B0C4158AE59B4D39F6F7E8A105D3FEEDA5D5F3D9E45BFA6CC351E220AE0CE106986D61FF34A11E19FD3650E9B7818FC33A1E0FC02C44557AC8AB50C9B2DEB2F6B5E24C4FDD9F8867BDCE1FF261008E7897970E346207D75E47A158298E5BA2F56246869CC42E362A02731264E60687EF5309D108534F51F8658FB4F080B7CB19EE9AEBD718CC4FA27C8C37DFC1ADA5D133D13ABE03F021E9B1B78CCBD82F7FF2B38C6D48D01E481B2D4FAF7171805FD7F2D39EF4C4F19B9496E81DAB8193B3737E1B27D9C43957166441B93515E8F03C95D8E8CE1E1864FAAD68DDFC5932130109390B0F1FE5CA716805F8362E98DCCAADC86ADBED25801A9A9DCFA6264319DDAFE83A89C51F3C6D199D38DE10E660C37BE872C3F2B31660DE8BC95902B9103262CDB941F77376F5D3DBB7A3D5A387797FC4819A035ECA704CEDB37110EE7F206B0C8805AAEBF4963E7C4708CE8D4E092366E71792A8A3B2BBCDEE321B3E15380C541EF0930888969F7457AFE18588826A419D58311C1784B5484EECDB393F6A0ACA11B91DF0866B500B8DEE501FD7EB9BCE09A17D74124B4605ADFC0777BED9816D8D7E8488544A18D8045CB3283B0A752B881B5F500FADB59010E63D";
        byte[] bytes = Schnorr.getDRBG(ByteUtil.hexStringToByteArray(message)).nextBytes(32);
        System.out.println(ByteUtil.byteArrayToHexString(bytes).toUpperCase());
    }


}
