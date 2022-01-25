import fileinput
from collections import deque

DRONE = {int(q): int(n) for (q, n) in enumerate(fileinput.input().readline().split(","))}


def run(state, i: list):
    (m, m_p, rel) = state
    o = list()
    i_pos = 0
    while True:
        instruction = str(m[m_p]).zfill(5)
        modes = instruction[0:3][::-1]
        opcode = int(instruction[3:])

        def loc(p):
            return m[m_p + p] if modes[p - 1] == "0" else rel + m[m_p + p]

        def read(p):
            return m[m_p + p] if modes[p - 1] == "1" else m.setdefault(loc(p), 0)

        def write(p, v):
            m[loc(p)] = v

        if opcode == 1:
            write(3, read(1) + read(2))
            m_p += 4
        elif opcode == 2:
            write(3, read(1) * read(2))
            m_p += 4
        elif opcode == 3:
            write(1, i[i_pos])
            i_pos += 1
            m_p += 2
        elif opcode == 4:
            o.append(read(1))
            m_p += 2
        elif opcode == 5:
            m_p = read(2) if read(1) != 0 else m_p + 3
        elif opcode == 6:
            m_p = read(2) if read(1) == 0 else m_p + 3
        elif opcode == 7:
            write(3, 1 if read(1) < read(2) else 0)
            m_p += 4
        elif opcode == 8:
            write(3, 1 if read(1) == read(2) else 0)
            m_p += 4
        elif opcode == 9:
            rel += read(1)
            m_p += 2
        elif opcode == 99:
            return (m, m_p, rel), o
        else:
            raise ValueError(instruction)


s = 0
y = 0
h = deque()
while True:
    x = h[-1][0] if len(h) > 0 else 0
    started = None
    stopped = None
    while True:
        t = run((DRONE.copy(), 0, 0), [x, y])[1][0]
        if t == 1 and started is None:
            started = x
            if len(h) > 0:
                p_stopped = max(x + 1, h[-1][1])
                x = p_stopped - 1
                continue
        elif t == 0 and started is not None and stopped is None:
            stopped = x
        x += 1
        if x > max(1, y * 4) or stopped is not None:
            break
    assert not (started is not None and stopped is None)
    if started is not None and stopped is not None:
        s += stopped - started
        h.append((started, stopped, y))
        if len(h) == 100:
            (h_started, h_stopped, h_y) = h.popleft()
            if started + 100 <= h_stopped:
                print(started * 10000 + h_y)
                break
    y += 1
    if y == 50:
        print(s)
