def check_pass(score):
    if score >= 50:
        return "pass"
    else:
        return "fail"


for score in [45, 67, 89, 34, 72]:
    print(check_pass(score))
