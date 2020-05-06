package main

import (
	"fmt"
	"testing"
)

func compareSlices(a, b []int) bool {
	for i, val := range a {
		if val != b[i] {
			return false
		}
	}
	return true
}

// TestProcessRow used for ProcessRow function
func TestProcessRow(t *testing.T) {
	tests := []struct {
		inputRow []int
		correct  []int
	}{
		{[]int{0, 0, 0, 0}, []int{0, 0, 0, 0}},
		{[]int{1, 1, 1, 1}, []int{0, 0, 0, 4}},
		{[]int{1, 2, 1, 2}, []int{1, 2, 1, 2}},
		{[]int{1, 1, 2, 2}, []int{0, 0, 2, 4}},
		{[]int{3, 0, 3, 0}, []int{0, 0, 0, 6}},
		{[]int{4, 0, 0, 0}, []int{0, 0, 0, 4}},
		{[]int{1, 2, 3, 4}, []int{1, 2, 3, 4}},
		{[]int{4, 0, 0, 4}, []int{0, 0, 0, 8}},
		{[]int{0, 2, 2, 0}, []int{0, 0, 0, 4}},
		{[]int{3, 4, 4, 2}, []int{0, 3, 8, 2}},
	}

	// loop through the test cases
	for _, testCase := range tests {
		t.Run(fmt.Sprintf("(%v)", testCase.inputRow), func(t *testing.T) {
			actual := ProcessRow(testCase.inputRow)

			if !compareSlices(actual, testCase.correct) {
				t.Fatalf("ProcessRow() = %v; correct answer was %v", actual, testCase.correct)
			}

			// if actual != testCase.correct {
			// 	t.Fatalf("ProcessRow() = %v; correct answer was %v", actual, testCase.correct)

			// }
		})

	}
}
