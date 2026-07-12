class Solution {
public:
    bool isValid(string s) {
        stack<char> open;
        unordered_map<char, char> par = {
            {')', '('},
            {']', '['},
            {'}', '{'},
        };

        for(char l:s){
            if(par.find(l) != par.end()){
                if(open.empty()){
                    return false;
                }
                if(open.top() != par[l]){
                    return false;
                }
                open.pop();
            } else{
                open.push(l);
            }
            
        }
        return open.empty();
    }
};
