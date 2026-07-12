class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        fMap = {}
        for i in range(len(position)):
            fMap.setdefault(position[i], speed[i])
        
        position.sort(reverse=True)

        fSet = set()

        for i in range(len(position)):
            dist = target-position[i]
            hours = dist/fMap[position[i]]

            if i != 0 and position[i-1] > hours:
                hours = position[i-1]
            position[i] = hours
            fSet.add(hours)

        return len(fSet)