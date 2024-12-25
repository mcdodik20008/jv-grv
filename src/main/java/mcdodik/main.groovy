def countElements(List<Integer> elements) {
    elements.countBy { it }
}

def input = [1, 3, 4, 5, 1, 5, 4]
def output = countElements(input)
println output
