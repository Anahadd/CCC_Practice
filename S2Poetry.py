def classify_rhyme(line1, line2, line3, line4):
    def get_last_syllable(word):
        vowels = "aeiou"
        last_vowel_index = max([word.rfind(v) for v in vowels if v in word], default=-1)
        return word[last_vowel_index+1:]
    
    def rhymes(syllable1, syllable2):
        return syllable1.lower() == syllable2.lower()
    
    syllable1 = get_last_syllable(line1)
    syllable2 = get_last_syllable(line2)
    syllable3 = get_last_syllable(line3)
    syllable4 = get_last_syllable(line4)
    
    if rhymes(syllable1, syllable2) and rhymes(syllable3, syllable4):
        return "perfect"
    elif rhymes(syllable1, syllable3) and rhymes(syllable2, syllable4):
        return "cross"
    elif rhymes(syllable1, syllable4) and rhymes(syllable2, syllable3):
        return "shell"
    elif rhymes(syllable1, syllable2) and rhymes(syllable2, syllable3) and rhymes(syllable3, syllable4):
        return "even"
    else:
        return "free"

num_verses = int(input())
verses = []
for i in range(num_verses):
    verse_lines = [input() for i in range(4)]
    verses.append(verse_lines)

for verse in verses:
    form = classify_rhyme(verse[0], verse[1], verse[2], verse[3])
    print(form)
