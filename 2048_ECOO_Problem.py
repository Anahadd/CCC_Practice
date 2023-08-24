def slide_row(row):
    row = [x for x in row if x != 0]
    for i in range(len(row) - 1):
        if row[i] == row[i + 1]:
            row[i] *= 2
            row[i + 1] = 0
    row = [x for x in row if x != 0]
    return row

def rotate(grid):
    return [[grid[j][i] for j in range(len(grid))] for i in range(len(grid[0]) - 1, -1, -1)]

def play_game(grid):
    max_tile = 0
    for _ in range(4):
        merged_grid = [slide_row(row) + [0] * (len(row) - len(slide_row(row))) for row in grid]
        max_tile = max(max_tile, max(max(row) for row in merged_grid))
        grid = rotate(grid)
    return max_tile

grid = [list(map(int, input().strip().split())) for _ in range(20)]

max_tile = play_game(grid)
print(max_tile)
