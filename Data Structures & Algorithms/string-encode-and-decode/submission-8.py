class Solution:

    def encode(self, strs: List[str]) -> str:
        encoded_str_list = []
        for i in range(len(strs)):
            encoded_str_list.append("#")
            encoded_str_list.append(str(len(strs[i])))
            encoded_str_list.append("?")
            encoded_str_list.append(strs[i])

        result = "".join(encoded_str_list)

        return result

    def decode(self, s: str) -> List[str]:
        decoded_strs = []
        leng = 0
        p1, p3 = 0, 0
        while p1 < len(s):

            while s[p3] != "?":
                p3 += 1
            leng = s[p1 + 1 : p3]
            p1 = (p3 + int(leng) + 1)
            decoded_strs.append(s[p3 + 1 : p1])
       
            p3 = p1
        return decoded_strs



