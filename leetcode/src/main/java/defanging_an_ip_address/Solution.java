package defanging_an_ip_address;

/*
https://leetcode.com/problems/defanging-an-ip-address/post-solution/?submissionId=645647662
*/

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}