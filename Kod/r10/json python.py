import json

lancuch_json = '{"imie": "Baltazar", "nazwisko": "Gąbka", "tytul": "Proof."}'

postac = json.loads(lancuch_json)

print(postac['tytul'], postac['imie'], postac['nazwisko'])

# przeksztalcamy json na python (nie dziala)